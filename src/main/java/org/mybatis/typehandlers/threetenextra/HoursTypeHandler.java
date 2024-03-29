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

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.threeten.extra.Hours;

/**
 * Type Handler for ThreeTen-Extra's {@link Hours}.
 *
 * @author Björn Raupach
 */
public class HoursTypeHandler extends BaseTypeHandler<Hours> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int parameterIndex, Hours hours, JdbcType type)
      throws SQLException {
    ps.setInt(parameterIndex, hours.getAmount());
  }

  @Override
  public Hours getNullableResult(ResultSet rs, String columnName) throws SQLException {
    int hours = rs.getInt(columnName);
    return hours == 0 && rs.wasNull() ? null : Hours.of(hours);
  }

  @Override
  public Hours getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
    int hours = rs.getInt(columnIndex);
    return hours == 0 && rs.wasNull() ? null : Hours.of(hours);
  }

  @Override
  public Hours getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
    int hours = cs.getInt(columnIndex);
    return hours == 0 && cs.wasNull() ? null : Hours.of(hours);
  }

}
