//type 1=registro ; 2=pedircarta
package General;

import java.io.Serializable;

public class Request implements Serializable{
	private int type; 
	private String idUser;	//para type = 1 o 2
	private String name;		//para type = 1
	private String time;		//para type = 2
	
	public Request(int type, String idUser,String name ,String tine){
		this.type = type;
		this.idUser = idUser;
		this.name = name;
		this.time = time;
	}
	
	public int getType(){
		return type;
	}
	public String getIdUser(){
		return idUser;
	}
	public String getName(){
		return name;
	}
	public String getTime(){
		return time;
	}
	
}
