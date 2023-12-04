import React, { useState } from 'react';
import { Text, View, TextInput, Alert, TouchableOpacity } from 'react-native';
import styles from './styles';

export default function Index() {
    const [height, setHeight] = useState('')
    const [weight, setWeight] = useState('')
    const [result, setResult] = useState('0')

    function calculateImc() {
        const imcValue = (weight / (height * height)).toFixed(2)

        return setResult(imcValue)
    }

    const validationImc = () => {
        if (height != '' && weight != '') {
            if (height >= 1 && weight >= 1) {
                calculateImc()
            } else {
                Alert.alert('Por favor digite um valor válido.')
            }
        } else {
            Alert.alert('Por favor preencha devidamente os campos.')
        }

        return
    }

    return (
        <View style={styles.container}>
            <View style={styles.topBox}>
                <Text style={styles.text}>CALCULAR IMC</Text>
            </View>

            <View style={styles.mainBox}>
                <View style={styles.inputBox}>
                    <View style={styles.inputField}>
                        <Text>Peso</Text>
                        <TextInput style={styles.input}
                            onChangeText={setWeight}
                            keyboardType='numeric'
                            placeholder='EX: 70'
                            value={weight}
                        />
                    </View>
                    <View style={styles.inputField}>
                        <Text>Altura</Text>
                        <TextInput style={styles.input}
                            placeholder='EX: 1.70'
                            keyboardType='numeric'
                            onChangeText={setHeight}
                            value={height}
                        />
                    </View>
                    <View style={styles.buttonField}>
                        <TouchableOpacity
                            style={styles.button}
                            onPress={validationImc}>
                            <Text style={styles.buttonText}>CALCULAR</Text>
                        </TouchableOpacity>
                    </View>
                    <View style={styles.resultField}>
                        <Text>Resultado:</Text>
                        <Text style={styles.resultText}>{result}</Text>
                    </View>
                </View>
            </View>
        </View>
    );
}