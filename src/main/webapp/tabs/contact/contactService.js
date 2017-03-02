angular.module('myApp')
.service('contactService',['$http',	contactService]);
function contactService($http) {
	return {
		sendEmail : sendEmail,
	};
	function sendEmail(contact){
		return $http.post('/sendEmail', contact)
		.then(sendEmailSuccess)
		.catch('error');
	}
	function sendEmailSuccess(response){
		return response.data;
	}
	function sendEmailError(response){
		return "Failed To send Email";
	}
}