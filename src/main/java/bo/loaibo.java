package bo;

import java.util.ArrayList;

import bean.LoaiBean;
import dao.loaidao;

public class loaibo {
	loaidao ldao= new loaidao();
	public ArrayList<LoaiBean> getloai() throws Exception{
		return ldao.getloai();
	} 
}