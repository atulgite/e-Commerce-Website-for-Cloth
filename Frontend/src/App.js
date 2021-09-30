import './App.css';
import Header from './components/Header';
import Home from './components/Home';
import Checkout from './components/Checkout';
import Login from './components/Login.js';
import Footer from './components/Footer.js';
import Search from './components/Search.js';
import MenCategory from './components/MenCategory.js';
import WomenCategory from './components/WomenCategory.js';
import Vendorlogin from './components/Vendorlogin.js';
import VendorHome from './components/VendorHome.js';
import Adminlogin from './components/AdminLogin.js';
import VendorHeader from './components/VendorHeader.js';
import AdminHeader from './components/AdminHeader.js';
import AdminHome from './components/AdminHome.js';
import VendorRegister from './components/VendorRegister.js';
import AddProduct from './components/AddProduct.js';
import Register from './components/Register.js';
import ViewProducts from './components/ViewProducts.js';
import ViewCustomer from './components/ViewCustomer.js';
import ViewCategory from './components/ViewCategory.js';
import ViewVendor from './components/ViewVendor.js';
import ViewOrders from './components/ViewOrders.js';
import ViewOrderbyuid from './components/ViewOrderbyuid.js';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';
import Payment from './components/Payment.js';
import ViewOutofStock from './components/ViewOutofStock.js';
import  AddCategory from './components/AddCategory.js';
import ForgetPassword from './components/ForgetPassword.js';
import ResetPassword from './components/ResetPassword.js';
import MyOrderplaced from './components/MyOrderplaced.js';
import AddMoney from './components/AddMoney.js';
import Wallet from './components/Wallet.js';
import Awallet from './components/Awallet.js';
import Vwallet from './components/Vwallet.js';
function App() {
 
  return (
    <Router>
    <div className="App">
      <Switch>
        <Route path="/checkout">
          <Header/>
          <Checkout />
          <Footer/>
          </Route>
        <Route path="/login">
          <Login/>
        </Route>
        <Route path="/register">
          <Register/>
        </Route>
        <Route path="/vendorregister">
          <VendorRegister/>
        </Route>
        <Route path="/payment">
          <Payment />
          <Footer/>
        </Route>
        <Route path="/vendorlogin">
          <Vendorlogin />
        </Route>
        <Route path="/adminlogin">
          <Adminlogin />
        </Route>
        <Route path="/search">
          <Header/>
          <Search />
          <Footer/>
        </Route>
        <Route path="/vendor">
          <VendorHeader />
          <VendorHome/>
        </Route>
        <Route path="/admin">
          <AdminHeader />
          <AdminHome/>
        </Route>
        <Route path="/addcategory">
          <AdminHeader />
          <AddCategory/>
        </Route>
        <Route path="/viewproducts">
          <AdminHeader />
          <ViewProducts />
        </Route>
        <Route path="/viewcustomer">
          <AdminHeader />
          <ViewCustomer />
        </Route>
        <Route path="/viewvendors">
          <AdminHeader />
          <ViewVendor />
        </Route>
        <Route path="/vieworders">
          <AdminHeader />
          <ViewOrders />
        </Route>
        <Route path="/viewcategory">
          <AdminHeader />
          <ViewCategory />
        </Route>
        <Route path="/addproduct">
          <VendorHeader />
          <AddProduct/>
        </Route>
        <Route path="/viewproductoutofstock">
          <VendorHeader />
          <ViewOutofStock/>
        </Route>
        <Route path="/forgetpass">
          <ForgetPassword/>
          {/*<Footer/>*/}
        </Route>
        <Route path="/reset">
          <ResetPassword/>
        </Route>
        <Route path="/order">
          <Header/>
          <ViewOrderbyuid />
          <Footer/>
        </Route>
        <Route path="/placed">
          <MyOrderplaced />
        </Route>
        <Route path="/addmoney">
          <AddMoney/>
        </Route>
        <Route path="/wallet">
          <Wallet/>
        </Route>
        <Route path="/awallet">
          <Awallet/>
        </Route>
        <Route path="/vwallet">
          <Vwallet/>
        </Route>
        <Route path="/men">
          <Header/>
          <MenCategory />
          <Footer/>
        </Route>
        <Route path="/women">
          <Header/>
          <WomenCategory />
          <Footer/>
        </Route>
        <Route path="/">
          <Header/>
          <Home />
          <Footer/>
        </Route>
      </Switch>
    </div>
    </Router>
  );
}
export default App;
