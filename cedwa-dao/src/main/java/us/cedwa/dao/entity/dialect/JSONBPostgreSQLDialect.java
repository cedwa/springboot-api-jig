package us.cedwa.dao.entity.dialect;

import org.hibernate.dialect.PostgreSQL9Dialect;

import java.sql.Types;

/**
 * Created by cedwa on 1/19/16.
 */
public class JSONBPostgreSQLDialect extends PostgreSQL9Dialect {

    public JSONBPostgreSQLDialect() {
        super();
        this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }

}
