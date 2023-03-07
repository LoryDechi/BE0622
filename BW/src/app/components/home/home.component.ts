import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { JwtResponse } from 'src/app/interfaces/jwt-response';
import { User } from 'src/app/interfaces/user';
import { AuthService } from 'src/app/services/auth.service';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  jwtRes!: JwtResponse;
  user!: User;

  gap: string = "";
  subDate: string = "";
  lastContact: string = "";
  partial: string = "";

  @ViewChild('form') form!: NgForm;
  @ViewChild('form1') form1!: NgForm;
  @ViewChild('form2') form2!: NgForm;
  @ViewChild('form3') form3!: NgForm;

  constructor(private dataSrv: DataService,  private router: Router) { }

 ngOnInit():void {
    this.getUser();
  }

  getUser(){
    const user = localStorage.getItem('user');
    if(!user){
      return;
    } else{
      const userParsed: JwtResponse = JSON.parse(user);
      this.dataSrv.getUser(userParsed.id, userParsed.token).subscribe({
        next:data => data != null? this.user = data : console.log(data),
        error: e => console.log(e)
      })
    }
  }

  async onSubmit(){
    this.router.navigate(['/customer/filter_by_gap='+this.form.value.gap]);
  }
  async onSubmit1(){
    this.router.navigate(['/customer/filter_by_sub_date='+this.form1.value.subDate]);
  }
  async onSubmit2(){
    this.router.navigate(['/customer/filter_by_last_date='+this.form2.value.lastContact]);
  }
  async onSubmit3(){
    this.router.navigate(['/customer/filter_by_partial_name='+this.form3.value.partial]);
  }

}
