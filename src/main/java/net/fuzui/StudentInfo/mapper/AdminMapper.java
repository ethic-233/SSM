package net.fuzui.StudentInfo.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: StudentInfo
 * @Package: net.fuzui.StudentInfo.mapper
 * @ClassName: AdminMapper
 * @Description: 管理员数据访问层接口
 */
public interface AdminMapper {

    /**
     *  管理员登录设置
     * @param aname   管理员账号（唯一）
     * @param apassword   密码
     * @return
     */
    public String queryByNamePwd(@Param("aname") String aname, @Param("apassword") String apassword);

}
