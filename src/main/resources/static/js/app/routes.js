angular.module('NoteWrangler').config(function($routeProvider){
  $routeProvider
    .when('/', {
      redirectTo: '/notes'
    })
    .when('/notes', {
      templateUrl: "ng_templates/notes/index.html",
      controller: "NotesIndexController"
    })

    .when('/notes/new', {
      templateUrl: "ng_templates/notes/new.html",
      controller: "NotesCreateController"
    })

    .when('/notes/:id', {
      templateUrl: "ng_templates/notes/show.html",
      controller: "NotesShowController"
    })

    .when('/notes/:id/edit', {
      templateUrl: "ng_templates/notes/edit.html",
      controller: "NotesEditController"
    })

    .when('/users', {
      templateUrl: "ng_templates/users/index.html",
      controller: "UsersIndexController"
    })

    .when('/users/:id', {
      templateUrl: "ng_templates/users/show.html",
      controller: "UsersShowController"
    });
  //     .when('/login', {
  //     templateUrl: 'ng_templates/login.html',
  //     controller: 'navigation',
  //     controllerAs: 'controller'
  // });

});