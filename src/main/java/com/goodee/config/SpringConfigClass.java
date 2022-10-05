package com.goodee.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//전체 환경 설정을 해주는 엔트리 클래스
public class SpringConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	// 프로젝트에서 사용할 Bean들을 정의하기 위한 클래스를 지정한다.
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootAppContext.class};
	}
	// RootAppContext 임시로 사용할 bean의 내용들을 선언

	// Spring MVC 프로젝트 설정을 위한 클래스를 지정한다.
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ServletAppContext.class};
	}
	// ServletAppContext MVC에 필요한 여러 구성 정보를 담은 클래스를 지정
	
	// DispatcherServlet에 매핑할 요청 주소를 세팅한다.
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	// 파라미터 인코딩 필터 설정
	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}
}
