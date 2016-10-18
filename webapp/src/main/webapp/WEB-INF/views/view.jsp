<jsp:include page="menu.jsp"/>

<div ng-app="myApp" ng-controller="myCtrl" ng-init="test='${pid}'"> 

<p><input type="text" ng-model="test"  hidden> </p>

<table border="1" width="50%" class="table table-hover table-responsive" >
<tr>
<th ng-click="orderByMe('pid')">Product ID</th>
<th ng-click="orderByMe('pcat')">Product Category</th>
<th ng-click="orderByMe('pname')">Product Name</th>
<th ng-click="orderByMe('purl')">Product Image</th>
<th ng-click="orderByMe('pprice')">Product Price</th>
<th ng-click="orderByMe('pid')">View</th>
<th ng-click="orderByMe('pcat')">Add to Cart</th>
</tr>

<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
<td>{{x.pid}}</td>
<td>{{x.pcat}}</td>
<td>{{x.pname}}</td>
<td>{{x.purl}}</td>
<td>{{x.pprice}}</td>

<td><img src="/webapp/resources/images/{{x.purl}}.jpg" width="50" height="50"></td>
<td><a href="/webapp/view/{{x.pid}}" class="btn btn-info" role="button">View</a></td>
<td> <a href="#" class="btn btn-info" role="button">Add to cart</a></td>
</tr>
</table>

<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
 $http.get("/webapp/product/all")
  .then(function(response) {
      $scope.names= response.data;
  });
});
</script>



