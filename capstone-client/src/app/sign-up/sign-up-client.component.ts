import { Component, OnInit } from '@angular/core';
import { PersonalDetails } from './personal-data-form/personal-data-form.component';
import { UserDetails } from './user-data-form/user-data-form.component';

type ClientAccDetail = {
  creditAccNumber?: number;
  bankCode?: number;
  supplierLimit?: number;
  invoicePayment?: string;
};

@Component({
  selector: 'app-sign-up-client',
  templateUrl: './sign-up-client.component.html',
  styleUrls: ['./sign-up-client.component.scss'],
})
export class SignUpClientComponent implements OnInit {
  personalDetails: PersonalDetails;
  pageNumber: number;
  supplierAccDetail: ClientAccDetail;
  userDetails: UserDetails;

  constructor() {
    this.personalDetails = {
      firstName: '',
      lastName: '',
      email: '',
      mobileNumber: '',
      addressLine1: '',
      city: '',
      state: '',
      province: '',
      country: '',
    };
    this.pageNumber = 1;

    this.supplierAccDetail = {};
    this.userDetails = { password: '', username: '' };
  }

  ngOnInit(): void {}

  submitUserData = (value: UserDetails): void => {
    this.userDetails = value;
    this.goToNextPage();
  };
  submitPersonalData = (value: PersonalDetails): void => {
    this.personalDetails = value;
    this.goToNextPage();
  };

  gotoPreviousPage = (): void => {
    if (this.pageNumber > 1) {
      this.pageNumber = this.pageNumber - 1;
    }
  };

  goToNextPage = (): void => {
    if (this.pageNumber < 3) {
      this.pageNumber = this.pageNumber + 1;
    }
  };
}
