<jsp:include page="menu.jsp"></jsp:include>


<div ng-app="myApp" ng-controller="namesCtrl" ng-init="test='${pid}'">

<p>Type a letter in the input field:</p>

<p><input type="text" ng-model="test"></p>


<jsp:include page="data.jsp" />

<table border="1" width="50%" class="table table-hover table-responsive" >
<tr>
<th ng-click="orderByMe('pid')">Product ID</th>
<th ng-click="orderByMe('pcat')">Product Category</th>
<th ng-click="orderByMe('pname')">Product Name</th>
<th ng-click="orderByMe('pprice')">Product Price</th>
<th ng-click="orderByMe('pprice')">View</th>
<th ng-click="orderByMe('pprice')">Add to Cart</th>
</tr>
<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
<td>{{x.pid}}</td>
<td>{{x.pcat}}</td>
<td>{{x.pname}}</td>
<td>{{x.pprice}}</td>
<td><a href="${req.contextPath}/view/{{x.pid}}" class="btn btn-info" role="button">View</a></td>
<td> <a href="#" class="btn btn-info" role="button">Add to cart</a></td>
</tr>
</table>

</div>