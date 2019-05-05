package com.lgq.testmybatis.obj;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//自动生成无参数构造函数
@NoArgsConstructor
//自动生成全参数构造函数
@AllArgsConstructor
//自动为所有字段添加@ToString, @EqualsAndHashCode, @Getter方法，为非final字段添加@Setter
@Data
//chain 若为true，则setter方法返回当前对象
@Accessors(chain=true)
public class UserObj {

	private String id;
	
	private String username;
	
	private String email;
	
	private String mobile;
	
	private String password;
	
	private String realname;
	
	private String gender;
	
	private String photo;
	
	private String roleId;
	
	private String status;
	
	private int provinceId;
	
	private int cityId;
	
	private int areaId;
	
	private String ip;
	
	private String useragent;
	
	private String openid;
	
	private String unionid;
	
	private String createAt;
	
	private String createBy;
	
	private String updateAt;
	
	private String updateBy;
	
	private String deleteAt;
	
	private String deleteBy;

}
