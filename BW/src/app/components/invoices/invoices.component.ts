import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Invoice } from 'src/app/interfaces/invoice';
import { JwtResponse } from 'src/app/interfaces/jwt-response';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-invoices',
  templateUrl: './invoices.component.html',
  styleUrls: ['./invoices.component.scss']
})
export class InvoicesComponent implements OnInit {

  name!: string | null;
  allInvoices! : Invoice[];

  constructor(private route: ActivatedRoute, private dataSrv: DataService) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      this.name = params.get("id");
      if(!this.name){
        this.getAllInvoices();
      } else {
       this.getSingleInvoice(this.name);
      }

  })

  }

  getSingleInvoice(name: string){
    const user = localStorage.getItem('user');
    if(!user){
      return;
    } else{
      const userParsed: JwtResponse = JSON.parse(user);
      this.dataSrv.getSingleInvoice(name,userParsed.token).subscribe({
        next:data => data != null? this.allInvoices = data : console.log(data),
        error: e => console.log(e)
      })
    }
  }

  getAllInvoices(){
    const user = localStorage.getItem('user');
    if(!user){
      return;
    } else{
      const userParsed: JwtResponse = JSON.parse(user);
      this.dataSrv.getAllInvoices(userParsed.token).subscribe({
        next:data => data != null? this.allInvoices = data : console.log(data),
        error: e => console.log(e)
      })
    }
  }

}
