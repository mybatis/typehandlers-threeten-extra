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
import org.threeten.extra.Minutes;

/**
 * Type Handler for ThreeTen-Extra's {@link Minutes}.
 *
 * @author Björn Raupach
 */
public class MinutesTypeHandler extends BaseTypeHandler<Minutes> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int parameterIndex, Minutes minutes, JdbcType type)
      throws SQLException {
    ps.setInt(parameterIndex, minutes.getAmount());
  }

  @Override
  public Minutes getNullableResult(ResultSet rs, String columnName) throws SQLException {
    int minutes = rs.getInt(columnName);
    return minutes == 0 && rs.wasNull() ? null : Minutes.of(minutes);
  }

  @Override
  public Minutes getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
    int minutes = rs.getInt(columnIndex);
    return minutes == 0 && rs.wasNull() ? null : Minutes.of(minutes);
  }

  @Override
  public Minutes getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
    int minutes = cs.getInt(columnIndex);
    return minutes == 0 && cs.wasNull() ? null : Minutes.of(minutes);
  }

}
