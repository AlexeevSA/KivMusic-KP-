   M S B A M L   `   `   `  ????C  ?KivMusic, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null5clr-namespace:KivMusic.Views.HrKivMusic.Views.Hr  5           KivMusic.Views.Hr.HrWindow   5      R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5      R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5      Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5      @d2http://schemas.microsoft.com/expression/blend/2008     5      1localclr-namespace:KivMusic.Views.Hr     5        N? Title$  HrWindow??5	      .??5      ? 
??????? ? ColumnDefinitions 5   
   ?? 5      ?? 5       ? RowDefinitions 5   
   ?? 5      ?? 5      .+?5   
   ??  ?? Orientation$ Vertical=?6   $??0??6,   $??0??69   $??2??6I   .+?5      ?? $#??Тип больничного??6   $??Center=?6.   $??5q?6K   ?? 5      -   5        $??txtSickType??5      $??5q?6)   &   System.Windows.Controls.DataGrid  5      -   5        $??
dtSickType??5      $??5q?5      $	??150??6"      CanUserResizeColumns .     CanUserResizeRows .     CanUserAddRows .     CanUserDeleteRows .     CanUserSortColumns .  	   CanUserReorderColumns	 .  
   SelectionMode$
 Single=?5          AutoGenerateColumns .  ??5!      ?? *	sickTypes+   Columns 5$      0  *System.Windows.Controls.DataGridTextColumn  5%      ,  &System.Windows.Controls.DataGridColumn   Header$ id??5&         
IsReadOnly .    MaxWidth$ 0Q?5)      1  +System.Windows.Controls.DataGridBoundColumn   Binding 5'      ?? *id+5)        5+      $# Тип больничного??5,       .    Width5  /System.Windows.Controls.DataGridLengthConverter$ * 5/       5-      ?? *
typename+5/      52      ?? 53      -   5        $??
btnAddSick??53      $??Добавить??6'   $??5q?6:   6E   ?? 54      -   5        $??
btnUpdSick??54      $??Изменить??6'   $??5q?6:   6E   ?? 55      -   5        $??
btnDelSick??55      $??Удалить??6'   $??5q?69   6D   56      ?? 57   
   $ Vertical=?6   $??0??6,   $??1??69   $??2??6I   .+?58      ?? $??Тип отпуска??6   $??Center=?6*   $??5q?6G   ?? 59      -   5        $??txtVacationType??59      $??5q?6-     5:      -   5        $??dtVacationType??5;      $??5q?5:      $	??150??6"    .   .   .   .   .  	 .  $
 Single=?5B       .  ??5C      ?? *vacationTypes+ 5F        5G      $ id??5H       . $ 0Q?5K       5I      ?? *id+5K        5M      $ Тип отпуска??5N       . $ * 5Q       5O      ?? *
typename+5Q      5T      ?? 5U      -   5        $??btnAddVacation??5U      $??Добавить??6+   $??5q?6>   6I   ?? 5V      -	   5        $??btnUpdVacation??5V      $??Изменить??6+   $??5q?6>   6I   ?? 5W      -
   5        $??btnDelVacation??5W      $??Удалить??6+   $??5q?6=   6H   5X      ?? 5Z   
   $ Vertical=?6   $??1??6,   $??0??69   $??Bottom=?6I   .+?5[      ?? -   5        $??	btnLogOut??5[      $??
Выйти??6&   $??5q?66   6A   5\      ?? 5]   
   $ Vertical=?6   $??1??6,   $??1??69   $??Bottom=?6I   .+?5^      ?? -   5        $??
btnSickWin??5^      $'??!Выдать больничный??6'   $??5q?6C   6N   ?? 5_      -   5        $??btnVacationWin??5_      $??Выдать отпуск??6+   $??5q?6C   6N   5`      5a      5b      