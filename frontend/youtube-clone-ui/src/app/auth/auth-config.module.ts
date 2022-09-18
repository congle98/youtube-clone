import {NgModule} from '@angular/core';
import {AuthModule} from 'angular-auth-oidc-client';


@NgModule({
  imports: [AuthModule.forRoot({
    config: {
      authority: 'https://congle98.jp.auth0.com',
      redirectUrl: 'http://localhost:4200/callback',
      clientId: 'oBTVXSs7Cgxn86zhFLA0qg5PPOxlqaym',
      scope: 'openid profile offline_access email',
      responseType: 'code',
      silentRenew: true,
      useRefreshToken: true,
      secureRoutes: ['http://localhost:8080'],
      customParamsAuthRequest: {
        audience: 'http://localhost:8080'
      }
    }
  })],
  providers: [],
  exports: [AuthModule],
})
export class AuthConfigModule {
}
