package com.test.dao.handlers;

import com.test.enums.UserStatusEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@MappedTypes(UserStatusEnum.class)
public class EnumHander extends BaseTypeHandler<UserStatusEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, UserStatusEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getCode());
    }

    @Override
    public UserStatusEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return this.getNullableResult(rs.getString(columnName));
    }

    @Override
    public UserStatusEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return this.getNullableResult(rs.getString(columnIndex));
    }

    @Override
    public UserStatusEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return this.getNullableResult(cs.getString(columnIndex));
    }

    private UserStatusEnum getNullableResult(String value) {
        if (value == null) return null;
        return Optional.ofNullable(UserStatusEnum.getTarget(value))
                .orElseThrow(() ->
                        new IllegalArgumentException(value + " 无法转换为 " + UserStatusEnum.class.getSimpleName()));
    }
}
