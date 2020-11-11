package org.dell.kube.pages;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class MySqlPageRepository implements IPageRepository {
    private final DataSource dataSource;

    public MySqlPageRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Page create(Page page) {
        return null;
    }

    @Override
    public Page read(long id) {
        return null;
    }

    @Override
    public List<Page> list() {
        return null;
    }

    @Override
    public Page update(Page page, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
