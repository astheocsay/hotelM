package cn.zoro.hotelm.dao;

import cn.zoro.hotelm.dto.SampleDto;
import cn.zoro.hotelm.entity.SampleEntity;
import cn.zoro.hotelm.formbean.Sampleformbean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by fanlei on 2017/8/4.
 */
@Mapper
public interface SampleDao {
    @Select("select userid,username,phonenumber from user where userid = #{id}")
    SampleEntity getOneUser(@Param("id") int userid);
    @Select("select userid,username,phonenumber from user where username = #{name}")
    List<SampleDto> getUsers(@Param("name") String username);
    @Select("<script> " +
            "SELECT userid,username,phonenumber " +
            "FROM user " +
            " <where> " +
            " <if test=\"userid != null\">userid=#{userid}</if> " +
            " <if test=\"name != null\"> AND username=#{name}</if> " +
            " </where> " +
            " </script> ")
    List<SampleDto> getUserList(Sampleformbean sampleformbean);
}
