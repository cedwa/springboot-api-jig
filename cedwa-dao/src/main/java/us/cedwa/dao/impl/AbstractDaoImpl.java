package us.cedwa.dao.impl;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by cedwa on 8/17/15.
 */
public abstract class AbstractDaoImpl<T> {

    private Map<String, DataSource> datasources;
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Map<String, DataSource> getDatasources() {
        return datasources;
    }

    public void setDatasources(Map<String, DataSource> datasources) {
        this.datasources = datasources;
    }

    public NamedParameterJdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public abstract List<T> find(String guid);

    public abstract T save(T entity);

    public abstract T delete(String guid);
    public abstract T delete(T entity);
}
