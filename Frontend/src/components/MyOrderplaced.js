import React from 'react';
import '../register.css';
import 'react-dropdown/style.css';
import { Link } from 'react-router-dom';

export default class MyOrderplaced extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            sign: JSON.parse(localStorage.getItem('data1')),
        }
    }
    submitForm = (e) => {
    window.location.href="/";
    }
    render() {
        return (
            <div className='register'>
                <div className='register_container'>
                    <h2>Congratulation Your Order has begin Placed</h2><br/>
                    <form >
                        <h5>Order bill is mailed at: {this.state.sign.uemail}</h5><br/>
                        {/* <h5>Amount in wallet before placing order: {this.state.sign.uwallet}</h5><br/> */}
                        <h5>Order will be delivered at: {this.state.sign.uaddress}</h5><br/>
                        <Link to="/login"><button className='innerbutton' type="submit" value="Submit" /*onClick={this.submitForm}*/>Ok</button><br /></Link>
                    </form>
                </div>
            </div>

        )
    }
}