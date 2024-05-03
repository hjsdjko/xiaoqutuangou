package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 采购员
 *
 * @author 
 * @email
 */
@TableName("caigouyuan")
public class CaigouyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaigouyuanEntity() {

	}

	public CaigouyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 采购员姓名
     */
    @TableField(value = "caigouyuan_name")

    private String caigouyuanName;


    /**
     * 采购员手机号
     */
    @TableField(value = "caigouyuan_phone")

    private String caigouyuanPhone;


    /**
     * 采购员身份证号
     */
    @TableField(value = "caigouyuan_id_number")

    private String caigouyuanIdNumber;


    /**
     * 采购员头像
     */
    @TableField(value = "caigouyuan_photo")

    private String caigouyuanPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "caigouyuan_email")

    private String caigouyuanEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：采购员姓名
	 */
    public String getCaigouyuanName() {
        return caigouyuanName;
    }
    /**
	 * 获取：采购员姓名
	 */

    public void setCaigouyuanName(String caigouyuanName) {
        this.caigouyuanName = caigouyuanName;
    }
    /**
	 * 设置：采购员手机号
	 */
    public String getCaigouyuanPhone() {
        return caigouyuanPhone;
    }
    /**
	 * 获取：采购员手机号
	 */

    public void setCaigouyuanPhone(String caigouyuanPhone) {
        this.caigouyuanPhone = caigouyuanPhone;
    }
    /**
	 * 设置：采购员身份证号
	 */
    public String getCaigouyuanIdNumber() {
        return caigouyuanIdNumber;
    }
    /**
	 * 获取：采购员身份证号
	 */

    public void setCaigouyuanIdNumber(String caigouyuanIdNumber) {
        this.caigouyuanIdNumber = caigouyuanIdNumber;
    }
    /**
	 * 设置：采购员头像
	 */
    public String getCaigouyuanPhoto() {
        return caigouyuanPhoto;
    }
    /**
	 * 获取：采购员头像
	 */

    public void setCaigouyuanPhoto(String caigouyuanPhoto) {
        this.caigouyuanPhoto = caigouyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getCaigouyuanEmail() {
        return caigouyuanEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setCaigouyuanEmail(String caigouyuanEmail) {
        this.caigouyuanEmail = caigouyuanEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Caigouyuan{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", caigouyuanName=" + caigouyuanName +
            ", caigouyuanPhone=" + caigouyuanPhone +
            ", caigouyuanIdNumber=" + caigouyuanIdNumber +
            ", caigouyuanPhoto=" + caigouyuanPhoto +
            ", sexTypes=" + sexTypes +
            ", caigouyuanEmail=" + caigouyuanEmail +
            ", createTime=" + createTime +
        "}";
    }
}
