//package pack;
//
//import {ActivatedRouteSnapshot, Resolve, RouterStateSnapshot} from '@angular/router';
//import {Project} from '../domain/project';
//import {Observable} from 'rxjs/internal/Observable';
//import {PublicProjectsService} from '../service/all-projects/public-projects.service';
//import {Injectable} from '@angular/core';
//
//@Injectable()
//export class PublicProjectsResolve implements Resolve<Project[]> {
//
//  constructor(private publicProjectsService: PublicProjectsService) {
//  }
//
//  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<Project[]> {
//    return this.publicProjectsService.getAllPublicProjects();
//  }
//}
