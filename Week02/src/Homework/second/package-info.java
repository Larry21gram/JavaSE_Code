/**
 *  2，	创建一个Login类，里面有登录方法，接收一个用户名和密码，返回一个
		UserInter接口类型的实现类对象。
		在登录方法中，与UserData中的数据进行匹配，如果匹配失败则提示错误信息，如果成功则返回对应职业类型的实现类对象。
		方法： 接受 用户名 、密码 
		匹 配： 
		1、匹配职业  
		返回： 职业对应的实现类对象

	3，UserInter接口中的方法：
			void onLine();
			void offLine();
	4，四种职业类型都实现这个User接口并且复写方法，
	比如：	onLine：工人开始干活了，厨师开始做菜了等等
			offLine：工人干完了回家了，厨师做完了

 */
/**
 * @author lanou
 *
 */
package Homework.second;