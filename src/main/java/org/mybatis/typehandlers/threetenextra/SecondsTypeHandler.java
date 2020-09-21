/**
 *    Copyright 2017-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
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
import org.threeten.extra.Seconds;

/**
 * Type handler for ThreeTen-Extra's {@link Seconds}.
 *
 * @author Björn Raupach
 */
public class SecondsTypeHandler extends BaseTypeHandler<Seconds> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int parameterIndex, Seconds seconds, JdbcType type)
      throws SQLException {
    ps.setInt(parameterIndex, seconds.getAmount());
  }

  @Override
  public Seconds getNullableResult(ResultSet rs, String columnName) throws SQLException {
    int seconds = rs.getInt(columnName);
    return seconds == 0 && rs.wasNull() ? null : Seconds.of(seconds);
  }

  @Override
  public Seconds getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
    int seconds = rs.getInt(columnIndex);
    return seconds == 0 && rs.wasNull() ? null : Seconds.of(seconds);
  }

  @Override
  public Seconds getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
    int seconds = cs.getInt(columnIndex);
    return seconds == 0 && cs.wasNull() ? null : Seconds.of(seconds);
  }

}
