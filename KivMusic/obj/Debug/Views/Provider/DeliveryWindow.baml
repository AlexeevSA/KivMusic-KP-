   M S B A M L   `   `   `  ????C  ?KivMusic, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:KivMusic.Views.ProviderKivMusic.Views.Provider  5      ,    &KivMusic.Views.Provider.DeliveryWindow   5      R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5      R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5      Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5      @d2http://schemas.microsoft.com/expression/blend/2008     5      7local%clr-namespace:KivMusic.Views.Provider     5        N? Title$  DeliveryWindow??5	      .??5      ? 
??????? ? ColumnDefinitions 5   
   ?? 5      $	??13* ?6   ?? 5      $	??37* ?6    ? RowDefinitions 5   
   ?? 5      $
??366* ?6   ?? 5      $	??85* ?6   .+?5   
   &   System.Windows.Controls.DataGrid  -   5        $??
dtDelevery??5      $??0??5      $??1??5      $??5,5,5,5q?5         CanUserResizeColumns .     CanUserResizeRows .     CanUserAddRows .     CanUserDeleteRows .     CanUserSortColumns .     CanUserReorderColumns .  	   SelectionMode$	 Single=?5      
   AutoGenerateColumns
 .  ??5       ?? *
deliveries+   Columns 5$      0  *System.Windows.Controls.DataGridTextColumn  5%      ,  &System.Windows.Controls.DataGridColumn   Header$ id??5&         
IsReadOnly .    MaxWidth$ 0Q?5)      1  +System.Windows.Controls.DataGridBoundColumn   Binding 5'      ?? *id+5)        5+      $% Складская ячейка??5,       .    Width5  /System.Windows.Controls.DataGridLengthConverter$ * 5/       5-      ?? *	warehouse+5/        51      $ warehouseid??52       . $ 0Q?55       53      ?? *warehouseid+55        57      $! ФИО поставщика??58       . $ * 5;       59      ?? *
profileFIO+5;        5=      $ 	profileid??5>       . $ 0Q?5A       5?      ?? *	profileid+5A        5C      $ 
Товар??5D       . $ * 5G       5E      ?? *productname+5G        5I      $ 	productid??5J       . $ 0Q?5M       5K      ?? *	productid+5M        5O      $ Поставщик??5P       .  5Q      ?? *providername+5R        5T      $ 
providerid??5U       . $ 0Q?5X       5V      ?? *
providerid+5X      5\      ?? 5]   
    ?? Orientation$ Vertical=?6   $??0??6,   $??0??69   .+?5^      ?? $%??Складская ячейка??6   $??5q?6/   ?? 5_      -   5        $??cmbWarehouse??5_      $??5q?5`       ?? SelectedValuePath$ id??5b       ?? DisplayMemberPath$
 cell??5c      ??5a      ?? *
warehouses+5c      ?? 5d      $??
Товар??6   $??5q?6$   ?? 5e      -   5        $??
cmbProduct??5e      $??5q?5f      $ id??5h      $ productname??5i      ??5g      ?? *
products+5i      ?? 5j      $??Поставщик??6   $??5q?6(   ?? 5k      -   5        $??cmbProvider??5k      $??5q?5l      $ id??5n      $ providersname??5o      ??5m      ?? *	providers+5o      ?? 5q      -   5        $??btnAdd??5q      $??Добавить??6#   $??5q?66   6A   ?? 5r      -   5        $??btnUpd??5r      $??Изменить??6#   $??5q?66   6A   ?? 5s      -   5        $??btnDel??5s      $??Удалить??6#   $??5q?65   6@   5t      ?? 5v   
   $ Vertical=?6   $??1??6,   $??0??69   $??Bottom=?6I   .+?5w      ?? -   5        $??btnBack??5w      $??
Назад??6$   $??5q?64   6?   5x      5y      5z      