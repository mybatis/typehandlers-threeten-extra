/*
 *    Copyright 2017-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.typehandlers.threetenextra;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.DateTimeException;

import org.apache.ibatis.type.TypeHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.threeten.extra.DayOfMonth;

/**
 * @author Björn Raupach
 */
public class DayOfMonthTypeHandlerTest extends BaseTypeHandlerTest {

  private static final TypeHandler<DayOfMonth> TYPE_HANDLER = new DayOfMonthTypeHandler();

  private static final DayOfMonth DAY_OF_MONTH = DayOfMonth.now();

  @Override
  @Test
  public void shouldSetParameter() throws Exception {
    TYPE_HANDLER.setParameter(ps, 1, DAY_OF_MONTH, null);
    verify(ps).setInt(1, DAY_OF_MONTH.getValue());
  }

  @Override
  @Test
  public void shouldGetResultFromResultSetByName() throws Exception {
    when(rs.getInt("column")).thenReturn(DAY_OF_MONTH.getValue());
    assertThat(TYPE_HANDLER.getResult(rs, "column")).isEqualTo(DAY_OF_MONTH);
  }

  @Override
  @Test
  public void shouldGetResultNullFromResultSetByName() throws Exception {
    when(rs.getInt("column")).thenReturn(0);
    when(rs.wasNull()).thenReturn(true);
    assertThat(TYPE_HANDLER.getResult(rs, "column")).isNull();
  }

  @Override
  @Test
  public void shouldGetResultFromResultSetByPosition() throws Exception {
    when(rs.getInt(1)).thenReturn(DAY_OF_MONTH.getValue());
    assertThat(TYPE_HANDLER.getResult(rs, 1)).isEqualTo(DAY_OF_MONTH);
  }

  @Override
  @Test
  public void shouldGetResultNullFromResultSetByPosition() throws Exception {
    when(rs.getInt(1)).thenReturn(0);
    when(rs.wasNull()).thenReturn(true);
    assertThat(TYPE_HANDLER.getResult(rs, 1)).isNull();
  }

  @Override
  @Test
  public void shouldGetResultFromCallableStatement() throws Exception {
    when(cs.getInt(1)).thenReturn(DAY_OF_MONTH.getValue());
    assertThat(TYPE_HANDLER.getResult(cs, 1)).isEqualTo(DAY_OF_MONTH);
  }

  @Override
  @Test
  public void shouldGetResultNullFromCallableStatement() throws Exception {
    when(cs.getInt(1)).thenReturn(0);
    when(cs.wasNull()).thenReturn(true);
    assertThat(TYPE_HANDLER.getResult(cs, 1)).isNull();
  }

  @Test
  public void shouldThrowDateTimeException() throws Exception {
    when(rs.getInt("column")).thenReturn(999);
    Assertions.assertThrows(DateTimeException.class, () -> {
      ((DayOfMonthTypeHandler) TYPE_HANDLER).getNullableResult(rs, "column");
    });
  }

}
