import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CakeServiceService } from 'src/services/cake-service.service';

@Component({
  selector: 'app-cake-preview',
  templateUrl: './cake-preview.component.html',
  styleUrls: ['./cake-preview.component.css']
})
export class CakePreviewComponent implements OnInit {

  constructor(private cakeService:CakeServiceService,
    private activatedroute:ActivatedRoute) { }
  cakeDetails = {
    id: "",
    cakeName: "",
    mainIngredient: "",
    price: "",
    imageUrl: ""
  };

  ngOnInit(): void {
    this.getParam()
  }
  public getParam(){
    this.activatedroute.queryParams.subscribe(params => {
      console.log(params.id);
      this.getCakePrev(params.id)
  });
  }
  public getCakePrev(id){
    console.log("function called");
    
    this.cakeService.getCake(id).subscribe(
      (resp:any) =>{
        console.log(resp);
        this.cakeDetails.id = resp.identifier;
        this.cakeDetails.cakeName = resp.cakeName;
        this.cakeDetails.imageUrl = resp.imageUrl;
        this.cakeDetails.mainIngredient = resp.mainIngredient;
        this.cakeDetails.price = resp.price
      },
      (err) =>{
        console.log(err);
      }
    )
  }
}
