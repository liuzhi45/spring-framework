/***************************************************************************
 *
 * Copyright (c) 2022 www.jd.com, Inc. All Rights Reserved
 *
 **************************************************************************/
package beans;

/**
 * <p>
 * TODO:desc
 * </p>
 *
 * @author liuzhi18
 * @date 2023/04/18
 */
public class Person {

	private String name;

	private Integer age;

	public void init(){
		this.name = "张三";
		this.age = 18;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
