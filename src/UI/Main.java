package UI;

import Repository.DataSource.DataSource;
import Repository.DataSource.DataSourceImpl;
import Repository.Logic.Logic;
import Repository.Logic.LogicImpl;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSourceImpl();
        Logic logic = new LogicImpl(dataSource);
        UIAdapter uiAdapter = new UIAdapter(dataSource, logic);
        uiAdapter.show();
    }

}