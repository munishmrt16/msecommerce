<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="panel pannel-default">
	<div class="panel-header">Product Form</div>
	<div class="panel-body">
		<form:form action="${contextPath}/product/save" method="post"
			modelAttribute="product">
			<form:hidden path="pid" />
			<form:hidden path="newProduct" />
			<form:input path="pcat" cssClass="form-control" />
			<form:input path="pname" cssClass="form-control" />
			<form:input path="pprice" cssClass="form-control" />
			<hr />
			<input type="submit" value="Save" />
		</form:form>
	</div>
</div>
	
<table class="table table-striped">

	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>&#160;</th>
	</tr>

	<c:forEach items="${products}" var="product">	
		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>				
				<a href="${contextPath}/product/edit/${product.id}" class="btn btn-sm btn-primary">Edit</a>&#160;
				<a href="${contextPath}/product/delete/${product.id}" class="btn btn-sm btn-primary">Delete</a>			
			</td>		
		</tr>
	</c:forEach>



</table>


	