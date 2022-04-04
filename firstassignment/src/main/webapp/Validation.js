function validateForm() {
	var fname = document.forms["myform"]["firstname"].value;
	if (fname == null || fname == "") {
		alert("Name can't be left blank");
		return false;
	}
	var lname=document.forms["myform"]["lastname"].value;
if(lname==null || lname=="")
{
	alert("last name is mandatory");
	return false;
}	

var age=document.forms["myform"]["ageselect"].value;
if(age==null || age=="")
{
	alert("Age should not be blank");
	return false;
}

var gender=document.forms["myform"]["gender"].value;
if(gender==null || gender=="")
{
	alert("Please select any Gender option");
	return false;
}
else
{
	return true;
}
}