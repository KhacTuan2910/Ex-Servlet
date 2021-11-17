<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>
			<dec:title/>
		</title>
		<jsp:include page="/WEB-INF/views/layout/header.jsp"></jsp:include>
		<dec:head></dec:head>
	</head>
	<body class="layout-fixed">
	    <div class="preloader"></div>
		<!-- Header Layout -->
   		<div class="mdk-header-layout js-mdk-header-layout">
   			<jsp:include page="/WEB-INF/views/layout/topbar.jsp"></jsp:include>
   			<!-- Header Layout Content -->
			<div class="mdk-header-layout__content page">
	   			<jsp:include page="/WEB-INF/views/layout/navbar.jsp"></jsp:include>
				<dec:body></dec:body>
			</div>
			<!-- // END Header Layout Content -->
   		</div>
		<jsp:include page="/WEB-INF/views/layout/footer.jsp"></jsp:include>
		<dec:getProperty property="page.scripts" />
	</body>
</html>