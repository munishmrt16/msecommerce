<jsp:include page="menu.jsp"></jsp:include>


<div ng-app="myApp" ng-controller="namesCtrl">

<p>Type a letter in the input field:</p>

<p><input type="text" ng-model="test"></p>


<table border="1" width="100%" class="table table-hover table-responsive">
<tr>
<th ng-click="orderByMe('pid')">Product ID</th>
<th ng-click="orderByMe('pcat')">Product Category</th>
<th ng-click="orderByMe('pname')">Product Name</th>
<th ng-click="orderByMe('pprice')">Product Price</th>
</tr>
<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
<td>{{x.pid}}</td>
<td>{{x.pcat}}</td>
<td>{{x.pname}}</td>
<td>{{x.pprice}}</td>
</tr>
</table>

</div>

<script>
angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = [
        {pid:'p001',pcat:'tshirt',pname:'casual',pprice:'200'},
        {pid:'p002',pcat:'tshirt',pname:'formal',pprice:'300'},
        {pid:'p003',pcat:'shirt',pname:'casual',pprice:'400'},
        {pid:'p004',pcat:'shirt',pname:'formal',pprice:'500'},
        {pid:'p005',pcat:'jeans',pname:'casual',pprice:'1300'},
        {pid:'p006',pcat:'jeans',pname:'formal',pprice:'1200'},
        
        ];
    $scope.orderByMe = function(x) {
        $scope.myOrderBy = x;
    }
});
</script>



