package service;

import dao.Userdao;
import dto.Userdto;

public class Userservice {

	
		public boolean saveUser(Userdto dto)
		{
			if(dto.getAge()<18)
				return false;
			else {
				Userdao dao=new Userdao();
				Userdto dto1=dao.findByEmail(dto.getEmail());
				if(dto1 !=null) {
					return false;
				}else {
				dao.saveUser(dto);
				return true;
			}
		}
		}
	}

