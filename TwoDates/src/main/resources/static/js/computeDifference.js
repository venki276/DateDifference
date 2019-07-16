$(document).ready(function () {
	$("#showDiff").hide();
});

function compute() {
	var dates = {};
	dates["fromDate"] = $("#fromDate").val();
	dates["toDate"] = $("#toDate").val();
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "/computeDifference",
		data : JSON.stringify(dates),
		dataType : 'json',
		success : function(data) {
			if(data >= 0){
				$("#showDiff").show();
				$("#diffDate").html(data);
			} else {
				$("#showDiff").hide();
				$("#myModal").modal();
			}
		}
	});
}