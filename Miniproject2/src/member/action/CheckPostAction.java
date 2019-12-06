package member.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.control.CommandProcess;
import memberjsp.bean.ZipcodeDTO;
import memberjsp.dao.MemberjspDAO;

public class CheckPostAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// 데이터
		String sido = request.getParameter("sido");
		String sigungu = request.getParameter("sigungu");
		String roadname = request.getParameter("roadname");

		MemberjspDAO memberDAO = MemberjspDAO.getInstance();
		List<ZipcodeDTO> list = null;
		if (sido != null && roadname != null) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("sido", sido);
			map.put("sigungu", sigungu);
			map.put("roadname", roadname);

			list = memberDAO.getZipcodeList(map);

		}
		request.setAttribute("list", list);
		request.setAttribute("display", "/member/checkPost.jsp");
		return "/main/index.jsp";
	}
}
