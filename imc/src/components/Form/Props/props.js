import React from "react";
import { View, Text } from 'react-native';
import styles from "../Styles/styles";

const MyComponent = (props) => {
    return (
        <View style={styles.resultField}>
            <Text style={styles.resultText2}>Resultado:</Text>
            <Text style={styles.resultText}>{props.result}</Text>
        </View>
    );
};

export default MyComponent;