import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  search: string = "";
  @ViewChild('form') form!: NgForm;
  token! : string|null;

  constructor(private router: Router, private dataSrv: DataService) { }

  ngOnInit(): void {
    this.token = localStorage.getItem("user")
  }

  async onSubmit(){
    this.router.navigate(['/invoices/' + this.form.value.search]);
  }

}
