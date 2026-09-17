import { Component } from '@angular/core';
import { AccessKeys } from 'src/app/core/access-keys';

@Component({
  selector: 'app-org-role-permission-configuration-view',
  templateUrl: './org-role-permission-configuration-view.component.html',
  styleUrls: ['./org-role-permission-configuration-view.component.scss'],
})
export class OrgRolePermissionConfigurationViewComponent {
  public accessKey = AccessKeys.KEYS.orgRole;
}
