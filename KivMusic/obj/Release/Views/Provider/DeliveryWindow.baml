   M S B A M L   `   `   `  ???? C  ?KivMusic, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:KivMusic.Views.ProviderKivMusic.Views.Provider  ,    &KivMusic.Views.Provider.DeliveryWindow   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     @d2http://schemas.microsoft.com/expression/blend/2008     7local%clr-namespace:KivMusic.Views.Provider       N? Title$  DeliveryWindow??.??? 
??????? ? ColumnDefinitions ?? $	??13* ??? $	??37* ? ? RowDefinitions ?? $
??366* ??? $	??85* ?.+?&   System.Windows.Controls.DataGrid  -   $??
dtDelevery??$??0??$??1??$??5,5,5,5q?   CanUserResizeColumns .     CanUserResizeRows .     CanUserAddRows .     CanUserDeleteRows .     CanUserSortColumns .     CanUserReorderColumns .  	   SelectionMode$	 Single=?
   AutoGenerateColumns
 .  ???? *
deliveries+   Columns 0  *System.Windows.Controls.DataGridTextColumn  ,  &System.Windows.Controls.DataGridColumn   Header$ id??   
IsReadOnly .    MaxWidth$ 0Q?1  +System.Windows.Controls.DataGridBoundColumn   Binding ?? *id+  $% Складская ячейка?? .    Width5  /System.Windows.Controls.DataGridLengthConverter$ *  ?? *	warehouse+  $ warehouseid?? . $ 0Q? ?? *warehouseid+  $! ФИО поставщика?? . $ *  ?? *
profileFIO+  $ 	profileid?? . $ 0Q? ?? *	profileid+  $ 
Товар?? . $ *  ?? *productname+  $ 	productid?? . $ 0Q? ?? *	productid+  $ Поставщик?? .  ?? *providername+  $ 
providerid?? . $ 0Q? ?? *
providerid+??  ?? Orientation$ Vertical=?$??0??$??0??.+??? $%??Складская ячейка??$??5q??? -   $??cmbWarehouse??$??5q? ?? SelectedValuePath$ id?? ?? DisplayMemberPath$
 cell?????? *
warehouses+?? $??
Товар??$??5q??? -   $??
cmbProduct??$??5q?$ id??$ productname?????? *
products+?? $??Поставщик??$??5q??? -   $??cmbProvider??$??5q?$ id??$ providersname?????? *	providers+?? -   $??btnAdd??$??Добавить??$??5q??? -   $??btnUpd??$??Изменить??$??5q??? -   $??btnDel??$??Удалить??$??5q??? $ Vertical=?$??1??$??0??$??Bottom=?.+??? -   $??btnBack??$??
Назад??$??5q?