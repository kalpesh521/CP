import { Component } from '@angular/core';
// imported component from @angular/core library
// Component is a decorator function that specifies the Angular metadata for the component.
// The CLI generated three metadata properties:
// selector— the component's CSS element selector
// templateUrl— the location of the component's template file.
// styleUrls— the location of the component's private CSS styles.
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})

// The AppComponent class is the component class you defined in the component metadata.
// The class interacts with the view through an API of properties and methods.
export class AppComponent {
  title = 'USER REGISTRATION FORM';
  name = '';
  email = '';
  password = '';
  phone = '';
  age = '';
  dob = '';
  address = '';

  // The following snippet shows the AppComponent class with a single property, title, and the component metadata.
  getValue() {
    this.name = (<HTMLInputElement>document.getElementById('name')).value;
    this.email = (<HTMLInputElement>document.getElementById('email')).value;
    this.password = (<HTMLInputElement>(document.getElementById('password'))).value;
    this.phone = (<HTMLInputElement>document.getElementById('phone')).value;
    this.age = (<HTMLInputElement>document.getElementById('age')).value;
    this.dob = (<HTMLInputElement>document.getElementById('dob')).value;
    this.address = (<HTMLInputElement>document.getElementById('address')).value;
  }
}
