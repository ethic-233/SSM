package net.fuzui.StudentInfo.service;

import org.springframework.stereotype.Service;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.service
 * @ClassName: AdminService
 * @Description: 管理员service接口
 */

public interface AdminService {

    /**
     *  管理员登录设置
     * @param aname   管理员账号（唯一）
     * @param apassword   密码
     * @return
     */
    public String queryByNamePwd(String aname, String apassword);

}
