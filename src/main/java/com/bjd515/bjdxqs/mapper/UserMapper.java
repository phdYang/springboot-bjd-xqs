package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO User的mapper操作类
 * @Date 2018/10/8 14:30
 * @Created by zhaoyang
 */
@Mapper
@Repository
public interface UserMapper {

    /**
     * 查询所用用户,状态可用的用户（IsEnable为1的用户）
     * @return list<User>
     */
    @Select("SELECT * FROM t_user WHERE IsEnable=1")
    public List<User> getAllUsers();

    /**
     * 增加一名用户，默认可用状态设为1
     * @param user
     * @return
     */
    @Insert("INSERT INTO t_user" +
            "(UserCode,UserName,UserPass,RealName,Tel,OfficeTel,Email,Job,RoleGrade,CreateDate,IsEnable,SDesc) " +
            "VALUES " +
            "(#{userCode},#{userName},#{userPass},#{realName},#{tel},#{officTel},#{email},#{job},#{roleGrade},#{createDate},#{isEnable},#{sDesc})")
    public int insertUser(User user);

    /**
     * 根据id更新一条用户数据
     * @param user
     * @return
     */
    @Update("UPDATE t_user set " +
            "UserCode = #{userCode} ,UserName = #{userName},UserPass = #{userPass},RealName = #{realName},Tel = #{tel}," +
            "OfficeTel = #{officTel},Email = #{email},Job = #{job},RoleGrade = #{roleGrade},CreateDate = #{createDate},IsEnable = #{isEnable},SDesc = #{sDesc} " +
            "WHERE SeqId = #{seqId}")
    public int updateUser(User user);

    /**
     * 根据id删除一名用户，我们是在数据库中将其的IsEnable字段置为0
     * @param id
     * @return
     */
    @Update("UPDATE t_user set IsEnable = 0 WHERE SeqId = #{id}")
    public int deletedUser(int id);

    @Select("SELECT COUNT(*) FROM t_user WHERE UserName=#{userName} and UserPass=#{userPass} ")
    public int login(User user);
}
