package dao;

import java.util.ArrayList;

import bean.LoaiBean;

public class loaidao {
	public ArrayList<LoaiBean> getloai() throws Exception{
		ArrayList<LoaiBean> ds= new ArrayList<LoaiBean>();
		ds.add(new LoaiBean("Công nghệ thông tin", "tin"));
		ds.add(new LoaiBean("Toán ứng dụng", "toan"));
		ds.add(new LoaiBean("Vật lý hữu cơ", "ly"));
		ds.add(new LoaiBean("Hóa hữu cơ", "Hoa"));
		return ds;
	}
}