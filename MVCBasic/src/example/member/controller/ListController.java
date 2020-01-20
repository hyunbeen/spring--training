/**
 * 
 */
package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import example.member.model.UserVOList;

@Controller
public final class ListController {
	@RequestMapping("/multiInsert.do")
	public void test(UserVOList userlist) {
			System.out.println("multiInsert호출");
			//두번째 사용자의 이름과 나이를 콘솔로 출력
	}
}
