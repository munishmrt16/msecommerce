<jsp:include page="menu.jsp"></jsp:include>

<p>Today's welcome message is:</p>
<div ng-app="myApp" ng-controller="myCtrl" ng-init="test='${x.id}'">

<p>Type a letter in the input field:</p>

<p><input type="text" ng-model="test"></p>


<table border="1" width="50%" class="table table-hover table-responsive" >
<tr>
<th ng-click="orderByMe('id')">Product ID</th>
<th ng-click="orderByMe('name')">Product Category</th>
<th ng-click="orderByMe('price')">Product Price</th>
<th ng-click="orderByMe('pprice')">View</th>
<th ng-click="orderByMe('pprice')">Add to Cart</th>
</tr>
<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
<td>{{x.id}}</td>
<td>{{x.name}}</td> 
<td>{{x.price}}</td>
<td><a href="webapp/view/{{x.id}}" class="btn btn-info" role="button">View</a></td>
<td> <a href="#" class="btn btn-info" role="button">Add to cart</a></td>
</tr>
</table>

<p>The $http service requests a page on the server, and the response is set as the value of the "myWelcome" variable.</p>

<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
 $http.get("/webapp/product/all")
  .then(function(response) {
      $scope.names= response.data;
  });
});
</script>
