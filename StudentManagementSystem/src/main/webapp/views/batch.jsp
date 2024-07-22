<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
<div class="d-flex justify-content-center align-center">

		<div class="w-50 align-middle border border-info  border-3 mt-2"
			style="height: 500px">
			<h6 class="p-3 text-primary ">
				<u>Student Details :-</u>
			</h6>

			<div class="border border-secondary m-3 p-2">

				<table class="table table-hover border border-secondary ">
					<tbody>
						<tr class="table-primary fs-6">
							<th>Student Id</th>
							<td>${stu.studentID}</td>
						</tr>
						<tr class="table-primary fs-6">
							<th>Student Name</th>
							<td>${stu.studentFullName}</td>
						<tr class="table-primary fs-6">
							<th>Course Name</th>
							<td>${stu.studentCourse}</td>
						</tr>
						<tr class="table-primary fs-6">
							<th>Fees Paid</th>
							<td>${stu.feesPaid}</td>
						</tr>
						
						</tr>
						<tr class="table-secondary fs-6">
							<th>Batch Mode</th>
							<td>${stu.batchMode}</td>
						</tr>
						<tr class="table-secondary fs-6">
							<th>Batch Number</th>
							<td>${stu.batchNumber}</td>
						</tr>
						
					</tbody>
				</table>

				<form action="shiftBatch">
				<input type="text" name="studentId" value="${stu.studentID}" hidden="true">
					 <div class="row"> 
                <div class="col"> 
 
                  <select class="select form-control-sm" name="batchMode"> 
                    <option value="#" disabled >Select Batch Mode</option> 
                    <option value="Online">Online</option> 
                    <option value="Offline">Offline</option> 
                    
                  </select> 
                  <label class="form-label select-label">Batch Mode</label> 
 
                </div> 
                 <div class="col"> 
 
                  <select class="select form-control-sm" name="batchNumber"> 
                    <option value="#" disabled>Select Batch Number</option> 
                    <option value="REG-177">REG-177</option> 
                    <option value="REG-178">REG-178</option> 
                    <option value="REG-179">REG-179</option> 
                    <option value="REG-179">REG-180</option> 
                     
                  </select> 
                  <label class="form-label select-label">Batch Number</label> 
 
                </div> 
              </div> 
					<div class="d-flex justify-content-center pt-5">
						<button class="btn btn-success btn-sm ">Update Information</button>
					</div>
				</form>

			</div>
		</div>
	</div>
</body>
</html>