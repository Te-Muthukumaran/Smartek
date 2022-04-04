package firstassignment.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import firstassignment.beans.RegInfoBean;

public class RegisterDao {

	public static List<RegInfoBean> register(HttpServletRequest req) {
		List<RegInfoBean> list = new ArrayList<RegInfoBean>();
		RegInfoBean info = new RegInfoBean(req.getParameter("firstname"), req.getParameter("lastname"),
				Integer.parseInt(req.getParameter("ageselect")), req.getParameter("gender"));

		list.add(info);
		//System.out.println(list);
		return list;
	}

}
