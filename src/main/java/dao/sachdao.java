package dao;

import java.util.ArrayList;

import bean.sachbean;

public class sachdao {
public ArrayList<sachbean> getsach() throws Exception{
	ArrayList<sachbean> ds= new ArrayList<sachbean>();
	ds.add(new sachbean("s1", "Cơ sở dữ liệu", "Hùng",(long)10,(long)100000, "image_sach/b1.jpg", "Công Nghệ Thông Tin"));
	ds.add(new sachbean("s2", "Cơ sở dữ liệu", "Hùng",(long)10,(long)100003, "image_sach/b2.jpg", "Công Nghệ Thông Tin"));
	ds.add(new sachbean("s3", "Giải tích 1", "Hùng",(long)10,(long)100002, "image_sach/b3.jpg", "Toán ứng dụng"));
	ds.add(new sachbean("s4", "Đại số", "Hùng",(long)10,(long)200000, "image_sach/b4.jpg", "Toán ứng dụng"));
	ds.add(new sachbean("s5", "Lý đại cương", "Hùng",(long)10,(long)200001, "image_sach/b5.jpg", "Vật lý hữu cơ"));
	ds.add(new sachbean("s6", "Hóa học đại cương", "Hùng",(long)10,(long)200003, "image_sach/b6.jpg", "Hóa hữu cơ"));
	return ds;
}

	
}