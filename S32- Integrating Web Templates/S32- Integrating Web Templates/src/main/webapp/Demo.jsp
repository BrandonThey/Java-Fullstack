<%-- By including the header and footer we can use those html elements in a jsp
context--%>
<jsp:include page="/include/header.jsp"></jsp:include>
<%-- Now just putting an h1 with hello world wont work since the template is 
containerized so instead we must add a section --%>
<h1>Hello World</h1>

<%-- using the about container lets us add our h1 hello world and it will show --%>
<section id="about" class="about">
      <div class="container">
		<h1>Hello World</h1>
      </div>
</section><!-- End About Section -->
    
<jsp:include page="/include/footer.jsp"></jsp:include>