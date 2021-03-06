package cn.wizzer.modules.services.sys;

import cn.wizzer.common.base.BaseService;
import cn.wizzer.modules.models.sys.Sys_menu;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by wizzer on 2016/6/24.
 */
@IocBean(args = {"refer:dao"})
public class MenuService extends BaseService<Sys_menu> {
    public MenuService(Dao dao) {
        super(dao);
    }
}
