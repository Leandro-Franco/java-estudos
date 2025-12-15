package local.config_devtools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//model
public class ProductRepository {

    private DataBase dataBase;

    @Autowired
    public ProductRepository(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String getMessage() {
        return "Product Name";
    }

    public String getList() {
        return "sem estoque";
    }

    public String getDataBase() {
        return dataBase.getDataBase();
    }
}
